# Remove the existing container if it exists
docker rm -f gptmc_devcontainer

# Create and start a new container
docker run -it \
  --name gptmc_devcontainer \
  -v /home/fabrice/JavaProjects/gptmc:/workspace \
  -w /workspace \
  gptmc

