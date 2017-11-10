// control.  7 noviembre Gariel Carcamo
#include<iostream.h>
#include<conio.h>

struct nodo{
	int dato;
	nodo *izq;
	nodo *der;
};

class arbol{
	private:
	nodo *R;
	public:
	arbol();
	void ingreso(int x);
	void elimina(int x);
	void mostrar();
};

nodo* eli(nodo* A, int x);      // Elimina un nodo, recibe como parámetro la raíz y el elemento a eliminar
nodo *ing1(nodo* A,int x);    // Crea un nodo, recibe como parámetro la raíz y el elemento a ingresar
void inorden(nodo *A);         // Recorre el árbol en inorden
void preorden(nodo *A);      // Recorre el árbol en preorden
void postorden(nodo *A);    // Recorre el árbol en postorden
int MayorElem(nodo *A);    // Encuentra el mayor elemento de un árbol
int esta(nodo *A, int x);       // Retorna un 1 si el elemento está en el árbol y un 0 si no ésta
void lvl(nodo *A, int x,int i);    //Muestra los elementos del nivel x en el arbol

int MayorElem(nodo *A){
	while(A->der){
		A = A->der;
	}
	return(A->dato);
}

// Función que determina si el elemento x está en el arbol (retorna 1) o no esta (retorna 0)
int esta(nodo *A, int x){
	if(A->dato == x){
		return 1;
	}
	if(A->izq == NULL && A->der == NULL){
		return 0;
	}
	if(A->dato < x){
		return(esta(A->der, x));
	}
	else {
		return(esta(A->izq,x));
	}
}

arbol::arbol(){
	R=NULL;
}

nodo* ing1(nodo *A, int x){
	if(A == NULL){
		A= new nodo;
		if(!A){
			cout << "NO HAY SUFICIENTE MEMORIA ";
			return A;
		}
	A->dato = x;
	A->izq = A->der = NULL;
	}
	else{
		if(A->dato < x){
			A->der=ing1(A->der,x);
		}
		else if (A->dato > x){
			A->izq=ing1(A->izq,x);
		}
		else{
			cout << "EL ELEMENTO YA EXISTE, NO PUEDE ESTAR REPETIDO";   
			getche();  
		}
	}
	return A;
}

nodo* eli(nodo* A, int x){
	nodo *p;
	int Mayor;
	if(A->dato == x){
		if(A->izq == NULL && A->der==NULL){   // caso 1: El elemento se encuentra en una hoja
			delete A;
			return NULL;
		}
		else if(A->izq == NULL){		// caso 2: La rama izquierda del dato es nula y en la derecha
			p= A->der;                              //             hay información
			delete A;
			return p;
		}
		else{
			Mayor=MayorElem(A->izq);     // Caso 3:  Que sea un nodo interno con rama izq. y rama der.
			A->dato = Mayor;
			A->izq = eli(A->izq, Mayor);
		}
	}
	else
	if(A->dato > x){				// Parte recursiva para recorrer el arbol hasta encontrar elemento
		A->izq = eli(A->izq,x);
	}
	else{
		A->der = eli(A->der,x);
	}
	return A;
}

 // Función miembro para el ingreso de información
void arbol::ingreso(int x)
{nodo *aux;
aux=R;
aux=ing1(aux,x);
R=aux;}

//Función miembro para eliminar un nodo del árbol
void arbol::elimina(int x)
{nodo *aux;
aux=R;
if (esta(aux,x)==1)
{aux=R;
aux=eli(aux,x);	// Elimina sólo si el elemento se encuentra en el árbol
R=aux;}
else
{cout << endl <<"EL ELEMENTO NO SE ENCUENTRA, NO PUEDE SER ELIMINADO";
getch();}}

// Función que recorre el arbol IRD
void inorden(nodo *A)
{if(A)
{inorden(A->izq);
cout << A->dato <<"\t";
inorden(A->der);}}

// Función que recorre el arbol RID
void preorden(nodo *A)
{if(A)
{cout << A->dato <<"\t";
preorden(A->izq);
preorden(A->der);}}

// Función que recorre el arbol IDR
void postorden(nodo *A)
{if(A)
{postorden(A->izq);
postorden(A->der);
cout << A->dato <<"\t";}}

 // Función miembro que elige la forma de mostrar los datos
void arbol::mostrar()
{int op,x,i;
do
{clrscr();
cout <<"\t\tMENU"<<endl;
cout <<"\t 1. Inorden"<<endl;
cout <<"\t 2. Preorden"<<endl;
cout <<"\t 3. Posorden"<<endl;
cout <<"\t 4. por nivel"<<endl;
cout <<"\t 5. salir"<<endl;
cout <<"      Opcion:  ";
cin >> op;
switch(op)
{case 1 :
inorden(R);
cout << endl<<"Presione una tecla para continuar"; getche();
break;
case 2 :
preorden(R);
cout << endl<<"Presione una tecla para continuar"; getche();
break;
case 3 :
postorden(R);
cout <<endl<< "Presione una tecla para continuar"; getche();
break;
case 4:
cout<<"ingrese nivel del arbol:"<<endl;
cin>>x;i=0;
lvl(R,x,i);
cout<<endl<<"presione una tecla para continuar";getch();break;
}}
while(op!=5);}

void lvl(nodo *A,int x,int i)
{if(A)
{if(x==i)
cout<<endl<<A->dato;
else
{i++;
lvl(A->izq,x,i);
lvl(A->der,x,i);}}}

// programa principal
int main()
{arbol a;
int x;
clrscr();
do
{cout <<"Ingrese elemento (0 para terminar) : ";
cin >> x;
if (x!= 0)
a.ingreso(x);
}while(x!=0);
a.mostrar();
cout << "Ingrese elemento a eliminar :   ";
cin >> x;
a.elimina(x);
a.mostrar();
cout << endl << "Presione una tecla para finalizar";
getche();
return 0;}