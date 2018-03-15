class Test {
	 public static void main(String[] args) {
		int i = 16;
		System.out.println("i>>>1="+(i>>>1));
		i = 16;
		System.out.println("i/2="+(i/2));

		i = 16;
		System.out.println("i>>2="+(i>>2));
		i = 16;
		System.out.println("i/4="+(i/4));


		i = -16;
		System.out.println("i>>>1="+(i>>>1));
		i = -16;
		System.out.println("i/2="+(i/2));
		i = -16;
		System.out.println("i>>2="+(i>>2));
		i = -16;
		System.out.println("i/4="+(i/4));

		i = -8;
		System.out.println("i>>>1="+(i>>>1));
		i = -8;
		System.out.println("i/2="+(i/2));
		i = -8;
		System.out.println("i>>2="+(i>>2));
		i = -8;
		System.out.println("i/4="+(i/4));
	}
}


/*
print content:



i>>>1=8
i/2=8
i>>2=4
i/4=4
i>>>1=2147483640
i/2=-8
i>>2=-4
i/4=-4
i>>>1=2147483644
i/2=-4
i>>2=-2
i/4=-2


*/