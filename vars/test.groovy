def info(message) {
    echo "INFO: ${message}"
    if(checkBranchIndexing()){
        return
    }
    echo "After info"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def readfile(filename,msg){
    stage('readfile'){
        bat "dir"
        bat "more ${filename}"
        echo "$msg"
        echo "${key}"
        def props=  readJSON file: '', text: '{"access_token":"test_token"}'
        echo "Hello World ${props['access_token']}"
    }
}

def testfn(){
   
   sh '''
   file=$name
   echo $file
   curl $file
   
   
   '''
  
}

def credtest(){
    stage('credtest'){
    environment{
   JEN = credentials('jenkinsid')
        sq = credentials('sonarqube_token')
    }
      echo "Hello World ${env.JEN_USR}"
           // sh 'echo "Service password is $JEN_USR"'
             echo "Hello World ${env.JEN_PSW}"
             
             echo "hello $env.sq"
    }
    
}

def envname(){
    echo "name is ${env.BRANCH_NAME}"
return env.BRANCH_NAME
}

def credtest2(){
withCredentials([string(credentialsId: 'sonarqube_token', variable: 'sonarqube')]) {
   echo "hello $sonarqube"
}
}

def checkBranchIndexing(){
    def isBranchIndexing = false
    if (!currentBuild.rawBuild) {
      return true
    }

    currentBuild.rawBuild.getCauses().each { cause ->
      if (cause instanceof jenkins.branch.BranchIndexingCause) {
        isBranchIndexing = true
      }
    }
    return isBranchIndexing
 

}

