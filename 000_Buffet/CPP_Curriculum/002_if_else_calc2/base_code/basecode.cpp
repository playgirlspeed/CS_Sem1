// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
    gotoxy(3,5);
    cout <<'R';
    gotoxy(3+1,5);
    cout <<'o';
     gotoxy(3+2,5);
    cout <<'m'; 
     gotoxy(3+3,5);
    cout <<'e';
     gotoxy(3+4,5);
    cout <<'l';


	 gotoxy(3,5+1);
    cout <<'e';
     gotoxy(3,5+2);
    cout <<'n';
     gotoxy(3,5+3);
    cout <<'e';
    
    for(int i=0; i < 5; i++){
    	gotoxy(3,5);
    	cout << 'N';
    	
    }
    
     for(int i=0; i < 5; i++){
    	gotoxy(5,3);
    	cout << 'N';
    	
    }
    
    
	
	
	
}

