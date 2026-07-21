class array{
public static void main(String[] args){
    String[] name={"abu","ajay","abi","akash"};
    int[][]mark={{60,76,98,76,64},{54,76,96,85,64},{96,85,74,63,91},{65,75,93,72,59}};
    for(int i=0;i<name.length;i++)
    {
        System.out.println("name="+name[i]);
        double total=0;
        for(int j=0;j<mark[i].length;j++)
    {
        System.out.print(mark[i][j]+"");
        total+=mark[i][j];
    }
    System.out.println();
    System.out.println("average"+(total/5)+"%");
    System.out.println();
    }
    }
    }
