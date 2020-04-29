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
    }
}

