def info(message) {
    echo "INFO: ${message}"
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
   JEN = credentials('jenkinsid')
                sq = credentials('sonarqube_token')
      echo "Hello World ${JEN_USR}"
           // sh 'echo "Service password is $JEN_USR"'
             echo "Hello World ${JEN_PSW}"
             
             echo "hello $sq"
    
}

