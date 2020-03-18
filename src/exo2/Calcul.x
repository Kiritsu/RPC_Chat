program CALCUL_PROG { 
	version CALCUL_VERSION_INT { 
		void calcul_null(void)=0; 
		int add (int a, int b)=1; 
		int sub (int a, int b)=2; 
		int mul (int a, int b)=3; 
		int div (int a, int b)=4; 
		int mod (int a, int b)=5; 
	}=1; 
	version CALCUL_VERSION_FLOAT { 
		void calcul_null(void)=0; 
		float add (float a, float b)=1; 
		float sub (float a, float b)=2; 
		float mul (float a, float b)=3; 
		float div (float a, float b)=4; 
	}=2;
} = 0x22222220;