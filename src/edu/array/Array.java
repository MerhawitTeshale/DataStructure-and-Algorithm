package edu.array;

public class Array {
    private int [] items;
    private int count;
    public Array(int leght){
        items=new int[leght];
    }
    public void insert(int item){
        //if array is full then resize
        if(items.length==count){
            //create new array of twice size
            int [] newItems =new int[count*2];

            //copy all the existing items
            for (int i =0;i<count;i++)
                newItems[i]=items[i];

            //set items to this new array
            items=newItems;
        }

        //first insert the index of count and then
        //increment
        items[count++]=item;
    }

    public void removeAt(int index){
        //validate the index
        if(index<0||index>=count){
            throw new IllegalArgumentException();
        }
        //shift the items to the left and shrink the size
        for (int i=index; i<count;i++){
            items[i]=items[i+1];
            count--;
        }
    }
    public int indexOf(int item){
        //If we find it, return index
        for (int i =0;i<count;i++){
            if(items[i]==item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
}
