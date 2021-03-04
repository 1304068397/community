# 搭建VmwareHarbor 私有仓库

## 1. 环境、软件准备
harbor 需要依赖docker，compose工具，需要提前安装好

```aidl
1.docker
2.docker-compose
3.Harbor安装包
```

 
 
## 2. 安装docker ，看公司的gitlab swarm项目
## 3. 安装docker-compose
1. 下载
```aidl

curl -L "https://github.com/docker/compose/releases/download/1.24.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

结果如下
[root@dockerMaster harbor]# curl -L "https://github.com/docker/compose/releases/download/1.24.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   633  100   633    0     0    836      0 --:--:-- --:--:-- --:--:--   837
100 15.4M  100 15.4M    0     0  89009      0  0:03:01  0:03:01 --:--:--  118k


```
2. 修改文件权限
```aidl

chmod +x /usr/local/bin/docker-compose
```
3. 测试是否安装成功
```aidl

[root@dockerMaster harbor]# docker-compose --version
docker-compose version 1.24.0, build 0aa59064

```
## 4. 下载harbor安装包，
官网地址 https://goharbor.io/docs/2.2.0/install-config/download-installer/

## 5. 未完成 ，卡在harbor.yml