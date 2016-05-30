#!/bin/sh

set -ex

export AWS_DEFAULT_REGION="ap-northeast-1"
SECURITY_GROUP_NAME="circleci"
IP=`curl inet-ip.info`

trap "aws ec2 revoke-security-group-ingress --region ${AWS_DEFAULT_REGION} --group-name ${SECURITY_GROUP_NAME} --protocol tcp --port 22 --cidr ${IP}/32" 0 1 2 3 15
aws ec2 authorize-security-group-ingress --region ${AWS_DEFAULT_REGION} --group-name ${SECURITY_GROUP_NAME} --protocol tcp --port 22 --cidr ${IP}/32

scp circleci-web/target/circleci-web-1.0.war deploy@52.69.196.119:~/
ssh deploy@52.69.196.119 'sh ~/deploy.sh'

echo 'production'
