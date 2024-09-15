#!/bin/sh

IMAGE_NAME="gptmc"
DOCKERFILE_PATH="env/Dockerfile"

echo "Building the devcontainer..."

docker build -t $IMAGE_NAME -f $DOCKERFILE_PATH .

