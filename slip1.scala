object slip1
{
    def main(args: Array[String])
    {
        var str=""
        var emp= Map("mr.joshi"->"management",
                    "mr.rathi"->"management",
                    "mr.gaikar"->"technical",
                    "mr.kanojiya"->"h.r",
                    "mr.batham"->"finance",
                    "mr.malani"->"marketing")

    
    println("key        values")
        for ((k,v) <- emp)
        println(k,v)

    println("person having same department as mr.joshi")
        for ((k,v) <- emp)
        {
            if(k=="mr.joshi")
            {
                    str=v
            }
            if(v==str)
            {
                println(k,v)
            }
        }
    }
}