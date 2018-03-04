#!/bin/bash

set -e

mkdir -p /tmp/codedeploy/tomcat-deploy

cat </tmp/codedeploy/tomcat-deploy/env.properties
APPLICATION_NAME=$APPLICATION_NAME
DEPLOYMENT_GROUP_NAME=$DEPLOYMENT_GROUP_NAME
DEPLOYMENT_ID=$DEPLOYMENT_ID
EOF
