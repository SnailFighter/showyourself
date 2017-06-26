##/bin/sh 
# 将文件备份，然后删除文件
#author:cht

#查看本文件夹下文件（非目录）的大小
while true;
	do
		#30mins 执行一次
		/bin/sleep 1800  
		fileScope=`ls`;
		echo $fileScope;
		size=0;
		#计算文件大小
		for files in $fileScope
			do 	
				size=$[$size+`wc -c<$files`];
			done
		echo $size>>./script.txt;
		#文件大于2G
		if [ $[$size] -gt $[2*1000*1000] ];
			then
				echo " 文件大于2G">>./script.txt;
				#压缩每一个文件
				for i in `ls *log*|grep -v "gzip"`
					do
						tar -zcvf $i".gzip" $i;
						rm -f $i;
					done
				#发送邮件通知管理员
				echo "文件大于2G了，日志备份删除了日志文件，要及时清理空间哦，亲！" | mail -s "日志文件备份删除" cht_feng@163.com;
				
			else
				echo "小于2G">>./script.txt;
		fi
done
