fun main(){
    var students= names (listOf("Herman","Phelicia","Shamim","Kylla","Simon","Caro","Anita","Ben","Phanuel","Jenty"))
    println(students)
    Height(listOf(6,7,8,5,9))
    var carol=Person("Joyce",24,5,50)
    var seyyid=Person("Amos",35,8,70)
    var Sha =Person("Shanniz",30,6,65)
    var mylist=  mutableListOf(seyyid,carol,Sha)
    var sorted=mylist.sortedByDescending { data->data.age }
    println(sorted)
    var others=Person("Dennis",42,5,80)
    var other=Person("Silas",35,7,75)
    var newlist= listOf(others,other)
    var otherList=more(mylist.plus(newlist))
    println(otherList)
    var Volvo= Carobjec("KDZR2",500)
    var toyota=Carobjec("KAD78",700)
    var assets= listOf(Volvo,toyota)
    var types=Carobjects(listOf(Volvo,toyota))
    println(types)

}
fun names(nouns:List<String>): List<String>{
    var t= mutableListOf<String>()
        nouns.forEachIndexed { index, Q ->
            if (index % 2 == 0){
                println(t.add(Q))
            }

            }

    return t
        }
fun Height(height:List<Int>):String{
    var kilos=height.sum()
    var avg= height.average()
    var total=("sum is $kilos and avarage is $avg")
    println(total)

    return  total
}
data class Person(var name:String,var age:Int,var height: Int,var weight:Int)
fun more(plus:List<Person>){
}
data class Carobjec(var registration:String,var mileage:Int)
fun Carobjects(obj:List<Carobjec>):Double{
    var d=0.0
    obj.forEach {s->
        d+=s.mileage

    }

    return d/obj.count()

}





