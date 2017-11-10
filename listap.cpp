#include<iostream.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
struct nodo
{char prod[30];
int venta;
int stock;
long costo;
nodo *sig;};
class lista
{protected:
nodo *p;
public:
lista();
~lista();
void np();
void ingreso(char *a,int v,int c,long s);
void mostrar();
void elimina(char *k);};

lista::lista()
{p=NULL;};
lista::~lista()
{nodo *q;
while(p)
{q=p;
p=p->sig;
delete q;}};

void lista::np()
{nodo *q,*r;
float prod=0,i;long cmin;
q=p;
while(q)
{i++;
prod=prod+q->venta;
q=q->sig;};
prod=prod/i;
cout<<"el promedio de ventas es: "<<prod<<endl;
q=p;
while(q)
{if(q->venta<prod)
cmin=q->costo;
q=q->sig;}
while(q)
{if(q->venta<prod)
{if(q->costo<cmin)
cmin=q->costo;};
q=q->sig;}
if(p->venta<prod)
{if(p->costo==cmin)
{q=p;
p=p->sig;
delete q;}};
if(p->costo>=prod)
{q=p;
while(q)
{if(q->venta<prod)
{if(q->costo==cmin)
{r=q;
q=q->sig;
delete r;}};
if(q->venta>=prod)
q=q->sig;}}}

void lista::ingreso(char *a,int v,int s,long c)
{nodo *q,*r;
q=new nodo;
strcpy(q->prod,a);
q->venta=v;
q->stock=s;
q->costo=c;
q->sig=p;
if(!p||q->costo<=p->costo)
p=q;
else
{r=p->sig;
while(r&&r->costo<q->costo)
{q->sig=r;
r=r->sig;};
q->sig->sig=q;
q->sig=r;}};

void lista::mostrar()
{clrscr();
nodo *q;
q=p;
while(q)
{cout<<"nombre el producto:"<<q->prod<<endl<<"costo:"<<q->costo<<endl<<"vendidos:"<<q->venta<<endl<<"stock:"<<q->stock<<endl;
q=q->sig;};getch();clrscr();}
void lista::elimina(char *k)
{nodo *q,*r;
if(p->prod==k)
{q=p;p=p->sig;
delete q;};
if(p->prod!=k)
{r=p;
while(r)
{q=r->sig;
if(q->prod==k)
{r->sig=q->sig;
delete q;}
r=r->sig;}}};

int main()
{clrscr();
char a[30];
int v,s;
int o,y,g;
long c;
lista L;
o=1;
while(o==1)
{cout<<"desea ingresar nuevos elementos:"<<endl<<"1.si"<<endl<<"2.no"<<endl;
cin>>o;
if(o==1)
{cout<<endl<<"ingrese nombre del producto:"<<endl;
cin>>a;
cout<<endl<<"ingrese cantidad de "<<a<<" vendidos:"<<endl;
cin>>v;
cout<<endl<<"ingrese cantidad de "<<a<<" en bodega:"<<endl;
cin>>s;
cout<<endl<<"ingrese costo del producto"<<endl;
cin>>c;
L.ingreso(a,v,s,c);}};

L.mostrar();
cout<<endl<<"desea eliminar algun elemento"<<endl<<"1.si"<<endl<<"2.no"<<endl;
cin>>y;
if(y==1)
{cout<<endl<<"ingrese nombrer del producto a eliminar:"<<endl;
cin>>a;
L.elimina(a);};
L.np();L.mostrar();
getch();clrscr();
return 0;}







