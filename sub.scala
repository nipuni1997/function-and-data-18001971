object sub {
  class rational(i:Int,j:Int){

     def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
    def numer: Int = i/gcd(i,j)
    def denom: Int = j/gcd(i,j)

    override def toString: String = numer+"/"+denom
    def neg= new rational(-this.numer, this.denom)
    def add(r:rational)=new rational(this.numer*r.denom+r.numer*this.denom,denom*r.denom)

     def sub1(r:rational): rational =this.add(r.neg)




  }
  def main(argc: Array[String]): Unit ={
    val x=new rational(3,4)
    val y=new rational(5,8)
    val z=new rational(2,7)
    println("x-y-z :"+x.sub1(y).sub1(z))
  }

}
