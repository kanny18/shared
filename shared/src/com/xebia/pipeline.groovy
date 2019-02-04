def build() {
 echo "Testing" 
}
def test(name) {
  echo "/usr/local/bin/${name}"
}
def deploy(env,app) {
   echo "$env for $app"
}