 object negetive {
  class rational(x:Int,y:Int){
    def numer: Int = x
    def denom: Int = y


      def neg= new rational(-this.numer, this.denom)
    override def toString: String = numer+"/"+denom

    }
    def  main (argc: Array[String]): Unit ={

      println("Enter numer of rational number:")
      val p = readInt()
      println("Enter denom of rational number:")
      val q = readInt()
      val t=new rational(p,q)
      println("Rational number:"+t)
      println("Negetive Rational number:"+t.neg)
    }
  }


