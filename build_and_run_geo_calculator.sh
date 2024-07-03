#!/bin/bash

currentDirectory=$(pwd)

dockerfilePath="$currentDirectory/Dockerfile"

imageName="geometric-calculator-image"

containerName="geometric-calculator-container"

./gradlew clean build

if [ $? -ne 0 ]; then
    echo "Gradle build failed. Please check the errors above."
    exit 1
fi

docker build -t $imageName -f $dockerfilePath .

if [ $? -ne 0 ]; then
    echo "Docker image build failed. Please check the errors above."
    exit 1
fi

docker run -d -p 8080:8080 --name $containerName $imageName

if [ $? -ne 0 ]; then
    echo "Docker container failed to start. Please check the errors above."
    exit 1
fi

echo "Docker container started successfully on port 8080."
