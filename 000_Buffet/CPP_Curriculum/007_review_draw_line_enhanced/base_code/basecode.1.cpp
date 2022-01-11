// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	//*****
	//*****
	//*****
	
	for(int y = 1; y < 2; y++){
		for(int x = 1; x < 2; x++){
				gotoxy(x+0,y+1);
				cout <<"*" ;
		
		
		
		}
    cout << endl;
	}	
	
	for(int y = 1; y < 2; y++){
		for(int x = 1; x < 2; x++){
				gotoxy(x+0,y+1);
				cout <<" " ;
		
	sleep(1);	
	

		}
    cout << endl;
	}	
	
	
}
