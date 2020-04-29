def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def readfile(filename){
    stage('readfile'){
        bat "dir"
        bat "more ${filename}"
        echo "${key}"
    }
}

