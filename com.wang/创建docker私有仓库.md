# 创建docker 私有仓库
## 1. 拉取镜像
```aidl

docker pull registry
```
## 2. 运行生成容器
```aidl

docker run -itd -v /my/registry:/var/lib/registry -p 5000:5000 --name registry registry
```

## 3. 测试镜像仓库中所有的镜像
```
[root@dockerMaster community]# curl http://127.0.0.1:5000/v2/_catalog
{"repositories":["busybox"]}

```

## 4. 修改下镜像源并重启docker服务
```aidl

[root@node ~]# vi /etc/docker/daemon.json 
{
  "registry-mirrors": ["https://6v3ulzup.mirror.aliyuncs.com"],
  "insecure-registries": ["192.168.19.128:5000"]
}


[root@node ~]# systemctl restart docker
```

## 5. 下载镜像并为镜像打标签
```aidl

 docker tag busybox:latest  192.168.19.128:5000/busybox:1.0
```

## 6. 上传到镜像服务器
```aidl

docker push 192.168.19.128:5000/busybox:1.0 
```

## 7. 测试下载镜像
```aidl

 docker pull 192.168.19.128:5000/busybox:1.0
```

