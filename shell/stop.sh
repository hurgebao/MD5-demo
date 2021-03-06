#!/bin/bash 
source /etc/profile
project=MD5-demo.jar
echo stop springboot process
PROCESS=`ps -ef|grep $project|grep -v grep|grep -v PPID|awk '{ print $2}'`
for i in $PROCESS
do
  echo "Kill the $project process [ $i ]"
  kill -9  $i
done

