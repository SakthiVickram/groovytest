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

def testfn(name){
    def names=$name
   sh '''
   file=${names}
   curl $names
   
   '''
  
}

