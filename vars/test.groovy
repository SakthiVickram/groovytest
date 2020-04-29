def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def readfile(filename){
    stage (readfile){
        step{
        bat "dir"
        bat "more ${filename}"
            
        }
    }
}

