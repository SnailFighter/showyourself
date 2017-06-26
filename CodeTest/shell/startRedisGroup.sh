#!/bin/sh 
# 启动redis集群，哨兵实现

##redis配置文件
redis_master="./confs/redis-group1-m-6378.conf"
redis_slave1="./confs/redis-group1-m-6379.conf"
redis_slave2="./confs/redis-group1-m-6380.conf"

##哨兵配置文件
redis_sentinel1="./confs/sentinel-group1-1-16378.conf"
redis_sentinel2="./confs/sentinel-group1-1-16379.conf"
redis_sentinel3="./confs/sentinel-group1-1-16380.conf"

if [ ! -d "/root/hw/software/RedisGroup2/data/6378" ]
	then
		mkdir -p /root/hw/software/RedisGroup2/data/6378
		mkdir -p /root/hw/software/RedisGroup2/data/6379
		mkdir -p /root/hw/software/RedisGroup2/data/6380
	elif [ ! -d "/root/hw/software/RedisGroup2/logs/" ]
		then
			mkdir -p /root/hw/software/RedisGroup2/logs	
fi

if [ ! -d "/root/hw/software/RedisGroup2/data/6378/tmp" ]
	then
		mkdir -p /root/hw/software/RedisGroup2/data/6378/tmp
		mkdir -p /root/hw/software/RedisGroup2/data/6379/tmp
		mkdir -p /root/hw/software/RedisGroup2/data/6380/tmp
fi
		

##启动redis,把redis.conf配置替换为自己的
./redis1/src/redis-server ${redis_master}
./redis2/src/redis-server ${redis_slave1}
./redis3/src/redis-server ${redis_slave2}

##启动哨兵
./redis1/src/redis-sentinel ${redis_sentinel1}
./redis2/src/redis-sentinel ${redis_sentinel2}
./redis3/src/redis-sentinel ${redis_sentinel3}
