#!/bin/bash
export DOCKER_IP=127.0.0.1

# echo -e "Stopping platform containers..."
# pushd ../../flightdeck-platform-api/docker
# ./stop.sh
# popd

echo -e "Stopping Docker containers..."
docker-compose kill 

echo -e "\nRemoving Docker containers..."
docker-compose down

echo -e "\nStopped."