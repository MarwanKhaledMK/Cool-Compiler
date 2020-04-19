class Main inherits IO{
	
  main():Object{
    {
      out_int(fact_r(in_int()));
      out_string("\n");
      out_int(fact_itr(in_int()));
    }
  };
  
  fact_r(i : Int):Int{
	if(i=0) then 1 else (fact_r(i-1)*i) fi
  };
  
  fact_itr(i : Int):Int{
	let fact:Int <- 1 in {
        while(not(i=0)) loop
        {
          fact <- fact*i;
          i <- i-1;
        }
      	pool;
      fact;
    }
  };
};