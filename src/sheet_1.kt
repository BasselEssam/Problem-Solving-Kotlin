// sheet link ( https://codeforces.com/group/MWSDmqGsZm/contest/219158 )
fun main(){
                        // D. Difference
    val arr:List<String> = readln().split(" ")
    val A= arr[0].trim().toLong()
    val B= arr[1].trim().toLong()
    val C= arr[2].trim().toLong()
    val D= arr[3].trim().toLong()
    println("Difference = ${(A*B)-(C*D)}")
}