# project for testing cases in Jenkins

## 1) pipeline style project: 'players-jfile':
* based on Jenkinsfile;
* stages in file:
** checkout-->
** build-->
** run parallel tests (fail-fast)-->
** capture (archiveArtifacts, jacoco(), junit)-->
** post emailtext

## 2) freestyle project:'players-freestyle': 
* based on chosen steps;
* steps: compile-->test-->package-->archive-->test-->jacoco

## 3) pipeline style project: 'players-pipeline-script'
* based on pipeline-script;
* stages:
** checkout-->
** build-->
** run parallel tests (fail-fast)-->
** capture (archiveArtifacts, jacoco(), junit)-->
** post emailtext