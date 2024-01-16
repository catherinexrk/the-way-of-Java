

### 基础命令
`git init`初始化git
`git status`查看文件状态
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705395732302-a03d8519-8e62-4d42-a67d-82a768d26c09.png#averageHue=%231f1e1d&clientId=u9cbe7bc8-8bc1-4&from=paste&height=110&id=u4a6b0189&originHeight=165&originWidth=637&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=14233&status=done&style=none&taskId=ufa24b3cc-1dc3-44d0-a569-6f6d4226de4&title=&width=424.6666666666667)

`git add 文件名`
`git add "1.txt"`
`git add --all` 用于多文件添加
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705395848563-bb13ef55-b8bc-4a5a-8ebb-3d8df0ccda81.png#averageHue=%231a1a18&clientId=u9cbe7bc8-8bc1-4&from=paste&height=63&id=u91432611&originHeight=94&originWidth=1118&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=15152&status=done&style=none&taskId=u84049893-3edf-424f-bbf7-62621a9d356&title=&width=745.3333333333334)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705395872456-139673d8-d83f-45a0-b7e8-69ae072118b9.png#averageHue=%231b1a19&clientId=u9cbe7bc8-8bc1-4&from=paste&height=52&id=u73c0133d&originHeight=78&originWidth=1105&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=14459&status=done&style=none&taskId=u1085a4c6-1a10-4235-badd-7d21b141309&title=&width=736.6666666666666)

`git commit -m "上传文件描述`文件名
`git commit -m "1.txt update " 1.txt`
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396005910-c61770bf-c27e-4b41-bdd3-419d152f4f49.png#averageHue=%231e1d1c&clientId=u9cbe7bc8-8bc1-4&from=paste&height=105&id=u54a748c3&originHeight=158&originWidth=1084&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=27769&status=done&style=none&taskId=u3a7dab81-7edc-4199-bfcc-89adee7bc6e&title=&width=722.6666666666666)

`git commit -m "add more files"`添加多文件
`git commit -m "update 2 files`
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396170908-f21768f9-5567-4829-97f6-ffa6d3f8edad.png#averageHue=%231f1e1c&clientId=u9cbe7bc8-8bc1-4&from=paste&height=116&id=ueb353a1c&originHeight=174&originWidth=1071&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31480&status=done&style=none&taskId=u9cdb2860-7772-49a5-ac20-3800f39a8c4&title=&width=714)

`git remote add 远程仓库名 远程仓库地址`
`git remote add test [https://github.com/catherinexrk/idle.git](https://github.com/catherinexrk/idle.git)`
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396557913-dcb64ba7-c1a9-418a-8857-df152f18b47f.png#averageHue=%2321201e&clientId=u9cbe7bc8-8bc1-4&from=paste&height=135&id=u968272a9&originHeight=203&originWidth=1163&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=39498&status=done&style=none&taskId=ua8792755-c158-4a52-8bf6-31fe701946e&title=&width=775.3333333333334)

`git push test`将文件提交到仓库
`git pull test`从仓库获取最新文件
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396609307-2c406774-7e65-4944-8095-1917afbc7cf3.png#averageHue=%23201f1e&clientId=u9cbe7bc8-8bc1-4&from=paste&height=232&id=u8f5863c1&originHeight=348&originWidth=1101&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=61854&status=done&style=none&taskId=u4d66cb31-33f8-4064-880b-40770ea9df8&title=&width=734)![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396641557-5a9ab9d1-443a-4eca-91ca-d2a4e1512092.png#averageHue=%2322201e&clientId=u9cbe7bc8-8bc1-4&from=paste&height=110&id=u9017bb62&originHeight=165&originWidth=1072&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31301&status=done&style=none&taskId=uada99fc2-b5b0-4777-8de7-e1f30b1d880&title=&width=714.6666666666666)

`git reflog`查看历史操作
`git log`
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396693529-51ce6f6e-073a-488d-aa3c-c7b9343e462e.png#averageHue=%2323211f&clientId=u9cbe7bc8-8bc1-4&from=paste&height=257&id=ub5ac56ad&originHeight=385&originWidth=1082&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=99933&status=done&style=none&taskId=u972913ee-5aad-4d92-888a-8a211acf0c7&title=&width=721.3333333333334)

`git reset --hard 版本号`回退到指定版本
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705396942483-491a0c23-9661-4cc8-bede-142bb4075ad3.png#averageHue=%23201e1c&clientId=u9cbe7bc8-8bc1-4&from=paste&height=55&id=ue64b5155&originHeight=83&originWidth=1111&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=20501&status=done&style=none&taskId=uac2b8d71-3ba6-41b7-9dcb-402c13c035a&title=&width=740.6666666666666)

`git rm --cached 文件名`从暂存区删除文件

### 进阶部分
`git branch`查看当前分支
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705397098182-c26f3a06-ec25-4cc7-bc82-b46b6859bee6.png#averageHue=%231a1918&clientId=uc1da798f-96eb-4&from=paste&height=91&id=u902e83d1&originHeight=137&originWidth=1115&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=18735&status=done&style=none&taskId=u12a320c3-a30a-4a9c-9440-c98468be744&title=&width=743.3333333333334)

`git branch 分支名`创建新分支
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705397146938-8b0d3e13-b589-49f6-80c8-5e9996bd29b0.png#averageHue=%231a1a19&clientId=uc1da798f-96eb-4&from=paste&height=164&id=u19930fa0&originHeight=246&originWidth=1105&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=36208&status=done&style=none&taskId=ufe494eeb-fe80-438a-ae61-3c50cd8fb21&title=&width=736.6666666666666)

`git merge newBranch`将newBranch中的文件与master主支进行合并

`git branch -d 分支名`删除分支

`git checkout 分支名`切换当前工作方式分支
![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705397261414-aa532946-88d3-495d-8b66-0bf2957128ff.png#averageHue=%231d1c1a&clientId=uc1da798f-96eb-4&from=paste&height=66&id=uca977b26&originHeight=99&originWidth=1098&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=18910&status=done&style=none&taskId=ue88a5d79-14ca-4165-8cb4-3ed9df8fdce&title=&width=732)



![image.png](https://cdn.nlark.com/yuque/0/2024/png/32716362/1705397725746-76d242ad-d4b0-420d-8ee2-c34bc8d96f11.png#averageHue=%23fefcfc&clientId=u100c7b19-baa9-4&from=paste&height=477&id=uc22bc334&originHeight=715&originWidth=1443&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=65663&status=done&style=none&taskId=uca2ee204-c6e6-4d63-9746-02830f0d10c&title=&width=962)

### 团队合作

### idea配置git




