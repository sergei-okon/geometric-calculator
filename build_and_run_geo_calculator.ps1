$currentDirectory = Convert-Path .

$dockerfilePath = Join-Path -Path $currentDirectory -ChildPath "Dockerfile"

$imageName = "geometric-calculator-image"

$containerName = "geometric-calculator-container"

./gradlew clean build

if ($LASTEXITCODE -ne 0) {
    Write-Error "Gradle build failed. Please check the errors above."
    exit 1
}

docker build -t $imageName -f $dockerfilePath .

if ($LASTEXITCODE -ne 0) {
    Write-Error "Docker image build failed. Please check the errors above."
    exit 1
}

docker run -d -p 8080:8080 --name $containerName $imageName

if ($LASTEXITCODE -ne 0) {
    Write-Error "Docker container failed to start. Please check the errors above."
    exit 1
}

Write-Output "Docker container started successfully on port 8080."
