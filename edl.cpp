
Conversation opened. 1 read message.

Skip to content
Using Gmail with screen readers
Search


algoritmo 


Gmail
COMPOSE
Labels
Inbox
Sent Mail
Drafts (10)
A-Check
Buy
Code
Courses
Debts
Experian
Isapre
Music
Personal
Trip to Europe 2017 (2)
U Mayor
ZTrashMails (1,202)
More 
Move to Inbox More 
1 of 5  
 
Print all In new window
Gabriel Carcamo Informe Trabajo dinamicas lineales

Gabriel Carcamo <carcamo.gabriel@gmail.com>
Attachments16/11/2007

to algoritmo.lcc 
edl=programa
datos.cpp=datos necvesesarios para correr el programa
y archivo de informe de programa en estructuras dinámicas lineales
buenas tardes
3 Attachments 
 
	
Click here to Reply or Forward
1.54 GB (10%) of 15 GB used
Manage
Terms - Privacy
Last account activity: 1 hour ago
Details


#include<iostream.h>
#include<conio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
#include<fstream.h>
struct nodo
{ char nom[30];
  char dis[30];
  float pm;
  float pe;
  long stock;
  long venta;
  nodo *sig;};

class empresa
{private:
nodo *p;
public:
empresa();
~empresa();
void ingreso(nodo t);
void llenar();  //llena la lista
void pde(char em[30]);  //muestra los productos corresp. a una empresa "em"
void mostra();  //muestra los elementos de la lista
void pmv();  //muestra el/los prod. mas  vendidos
void emv();  //elimina los producos menos vendidos
void pms();  //muestra los productos con el mayor y menor stock
void pmpe(); //muestra los prod. con myor y menor precio de elab
void pmpm(); //muestra prod. con mayor y menor precio de mercado
void gp(char n[30]); //calcula la ganancia de un producto"n"
nodo *head(); // se obtiene la cabeza de la lista en el main
};

nodo *empresa::head()
{return p;}

empresa::empresa()
{p=NULL;};

empresa::~empresa()
{nodo *q;
while(p)
{q=p;
p=p->sig;
delete  q;}};

void mostrar(nodo *q)
{ cout<<"nombre prod.: "<<q->nom;
  cout<<endl<<"distribuidor: "<<q->dis;
  cout<<endl<<"precio de mercado: "<<q->pm;
  cout<<endl<<"precio de elab.: "<<q->pe<<endl;
  cout<<"stock :"<<q->stock;
  cout<<endl<<"vendidos :"<<q->venta<<endl;};

void empresa::ingreso(nodo t)
{nodo *q,*r;
q=new nodo;
if(!q)
{cout<<"memoria insuficiente"<<endl;
getch();
exit(0);};
  strcpy(q->nom,t.nom);
  strcpy(q->dis,t.dis);
  q->pm=t.pm;
  q->pe=t.pe;
  q->stock=t.stock;
  q->venta=t.venta;
  q->sig=p;
if(!p||strcmp(q->nom,p->nom)<=0)
p=q;
else
{r=p->sig;
while(r&&strcmp(r->nom,q->nom)<=0)
{q->sig=r;
r= r->sig;}
q->sig->sig=q;
q->sig=r;}}

void empresa::llenar()
{ifstream a;
nodo q;
a.open("datos.cpp");
if (a.fail())
{cout<<"\tNo se ha encontrado el archivo ";
 getch();clrscr();exit(0);}
do
{a>>q.nom;
if(strcmp(q.nom,""))
{a>>q.dis;
 a>>q.pm;
 a>>q.pe;
 a>>q.stock;
 a>>q.venta;
 ingreso(q);}}while(strcmp(q.nom,""));
a.close();}

void empresa::mostra()
{nodo* q;
q=p;
while(q)
{cout<<"nombre prod.: "<<q->nom;
  cout<<endl<<"distribuidor: "<<q->dis;
  cout<<endl<<"precio de mercado: "<<q->pm;
  cout<<endl<<"precio de elab.: "<<q->pe<<endl;
  cout<<"stock :"<<q->stock;
  cout<<endl<<"vendidos :"<<q->venta<<endl;
  q=q->sig;}}

void empresa::pde(char em[30])
{nodo *q;
q=p;
while(q)
{if(strcmp(q->dis,em)==0)
mostrar(q);
q=q->sig;}}

void empresa::pmv()
{nodo *q;
long max,min;
max=min=p->venta;
q=p;
while(q)
{if(q->venta<min)
min=q->venta;
else
{if(q->venta>max)
max=q->venta;}
q=q->sig;};
q=p;
cout<<"productos mas vendidos: "<<endl;
while(q)
{if(q->venta==max)
mostrar(q);
q=q->sig;};
q=p;
cout<<"productos menos vendidos: "<<endl;
while(q)
{if(q->venta==min)
mostrar(q);
q=q->sig;}};

void empresa::emv()
{nodo *q,*r;
long min;
min=p->venta;
q=p;
while(q)
{if(q->venta<min)
min=q->venta;
q=q->sig;};
q=p;
while(q)
{if(q->venta==min)
{r->sig=q->sig;
delete q;
q=r->sig;}
else
{r=q;
q=q->sig;}}};

void empresa::pms()
{nodo *q;
long max,min;
max=min=p->stock;
q=p;
while(q)
{if(q->stock<min)
min=q->stock;
else
{if(q->stock>max)
max=q->stock;}
q=q->sig;};
q=p;
cout<<"productos con mayor stock: "<<endl;
while(q)
{if(q->stock==max)
mostrar(q);
q=q->sig;};
q=p;
cout<<"productos con menor stock: "<<endl;
while(q)
{if(q->stock==min)
mostrar(q);
q=q->sig;}};

void empresa::pmpe()
{nodo *q;
float max,min;
max=min=p->pe;
q=p;
while(q)
{if(q->pe<min)
min=q->pe;
else
{if(q->pe>max)
max=q->pe;}
q=q->sig;};
q=p;
cout<<"productos con mayor precio de elab.: "<<endl;
while(q)
{if(q->pe==max)
mostrar(q);
q=q->sig;};
q=p;
cout<<"productos con menor precio de elab.: "<<endl;
while(q)
{if(q->pe==min)
mostrar(q);
q=q->sig;}};

void empresa::pmpm()
{nodo *q;
float max,min;
max=min=p->pm;
q=p;
while(q)
{if(q->pm<min)
min=q->pm;
else
{if(q->pm>max)
max=q->pm;}
q=q->sig;};
q=p;
cout<<"productos con mayor precio de mercado: "<<endl;
while(q)
{if(q->pm==max)
mostrar(q);
q=q->sig;};
q=p;
cout<<"productos con menor precio de mercado: "<<endl;
while(q)
{if(q->pm==min)
mostrar(q);
q=q->sig;}};

void empresa::gp(char n[30])
{nodo *q;
float gan;
q=p;
while(q)
{if(strcmp(q->nom,n)==0)
{gan=q->pm-q->pe;
cout<<endl<<"la ganancia proporcionada por el producto ";
cout<<n<<" es de: "<<gan<<" pesos por unidad."<<endl;}
q=q->sig;}}

int menu()
{empresa S;
int op,o;
char dis[30],nom[30];
S.llenar();
do
{cout<<"Bienvenido al programa espectador de empresa "<<endl;
cout<<"A continuacion se兀le lo que desea hacer: "<<endl;
cout<<"1. ver lista de productos"<<endl;
cout<<"2. eliminar de la lista los productos menos vendidos"<<endl;
cout<<"3. mostrar productos de cierto distribuidor "<<endl;
cout<<"4. mostrar gancias de un producto "<<endl;
cout<<"5. mostrar productos por mayor y menor campo seleccionado "<<endl;
cout<<"6. salir"<<endl;
cin>>op;
switch(op)
{case 1:
S.mostra();
cout<<"presione mostrar una tecla para continuar";getch();clrscr();break;
case 2:
S.emv();
cout<<"presione una tecla para continuar";getch();clrscr();break;
case 3:
cout<<"ingrese nombre del distribuidor :"<<endl;
cin>>dis;
S.pde(dis);
cout<<"presione una tecla para continuar";getch();clrscr();break;
case 4:
cout<<"ingrese nombre del producto"<<endl;
cin>>nom;
S.gp(nom);
cout<<"presione una tecla para continuar";
getch();clrscr();break;
case 5:
cout<<"mostrar los productos con mayor o menor :";
cout<<endl<<"1. ventas"<<endl;
cout<<"2. precio de elaboracion"<<endl;
cout<<"3. stock"<<endl<<"4. precio de mercado"<<endl;
cin>>o;
switch(o)
{case 1:
S.pmv();
cout<<"presione una tecla para continuar";getch();clrscr();break;
case 2:
S.pmpe();
cout<<"presione una tecla para continuar";getch();clrscr();break;
case 3:
S.pms();
cout<<"presione una tecla para continuar";getch();clrscr();break;
case 4:
S.pmpm();
cout<<"presione una tecla para continuar";getch();clrscr();menu();break;}
}}while(op!=6);return op;};

void main()
{menu();
clrscr();}
EDL.CPP
Open with Drive Notepad
Displaying EDL.CPP.