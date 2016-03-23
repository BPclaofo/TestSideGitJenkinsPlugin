{ ->
    node('slave') {
        hello 'world'
    }
}
def hello(whom) {
    echo "hello ${whom}"
}