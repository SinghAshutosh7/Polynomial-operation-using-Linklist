public class Polynomial extends LinkedList{
    
    public void trim(Polynomial p) {
        Node temp=p.head;
        while(temp!=null){
            if (temp.next==null ){
                break;
            }
            else if(temp.next!=null && p.head.data==0){
                p.head=p.head.next;
                temp=temp.next;
            }
            else{
                break;
            }
        }
    }


    public Polynomial add(Polynomial p){
        //to be implemented by the student
        int n=this.len();
        int m=p.len();
        Polynomial add_res=new Polynomial();
        int k,r;
        if(n>=m)
            {k=n;}
        else{k=m;}

        if(n>=m){
            r=n-m;
        }
        else{r=m-n;}
        Node temp1=this.head;
        Node temp2=p.head;
        for (int i=0;i<k;i++){
            add_res.insert(0);
            if (i<r && n>m){
                add_res.tail.data=add_res.tail.data +temp1.data;
                temp1=temp1.next;
            }
            else if (i<r && n<m){
                add_res.tail.data=add_res.tail.data +temp2.data;
                temp2=temp2.next;

            }
            else{
                add_res.tail.data=add_res.tail.data +temp1.data+temp2.data;
                temp1=temp1.next;
                temp2=temp2.next;

            }
        }
       
        p.trim(add_res);
        // p.display(); //remove

        // this.display();  //remove
        
        
        return add_res;
    }

    public Polynomial mult(Polynomial p){
        //to be implemented by the student
        int m=this.len();
        int n=p.len();
        Polynomial pf=new Polynomial();
        for (int i=0;i<(m+n-1) ; i++){
            pf.insert(0);}

        Node t_pf=pf.head;
        Node t1=this.head;
        Node t2=p.head;
        for (int i = 0; i < m; i++) {
            Node temp_pf= t_pf;
            Node tempT2=t2;
            for(int j=0; j<n; j++){
                temp_pf.data=temp_pf.data + (t1.data) * (tempT2.data);
                temp_pf=temp_pf.next;
                tempT2=tempT2.next;
            }
            t1=t1.next;
            t_pf=t_pf.next;
        }
        p.trim(pf);
        // p.display(); //remove
        // this.display();  //remove
        return pf;
    }


}