function func(){
var a=["a","b","c"];
var b=[1,2,3];
var arr=[];
for(i=0;i<a.length;i++)
{
    arr[i*2]=a[i];
    arr[i*2+1]=b[i];
}
document.write(arr);
}
func();