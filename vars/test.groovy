def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def readfile(filename){
    bat "dir"
    bat "more ${filename}"
}
