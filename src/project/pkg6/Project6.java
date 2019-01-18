/*
COSC 600
Project 6
Michael Rios
Professor H.  Zhou

 */

package project.pkg6;
import java.io.File;
import java.util.*;


public class Project6 {

    	public static void main(String[] args) throws Exception
	{
  
            
            node graph = new node();
            node graphII = new node();
            
            //Buildgraph(graph);
             
            buildGraphFile(graph);
            
            buildGraphFile(graphII);
           
            //printGraph(graph);
            
            System.out.println("DEPTH FIRST SEARCH");
            DFS(graphII, graphII, 1);

            System.out.println("\nBREADTH FIRST SEARCH");
            BFS(graph);
        }

        
public static void buildGraphFile(node q)
{
    int vertex = 1;
    //node head = new node();
    node ver = new node();
    node adj = new node();
    ver = q;
    
    q.data = vertex;
        
    try{ 
        Scanner sc = new Scanner(new  File("states2.txt"));
        while (sc.hasNextLine()){
            
            String line = sc.nextLine();
            //System.out.println(line);
        
            //System.out.print(vertex + " ");
            StringTokenizer st = new StringTokenizer(line);
            
            while (st.hasMoreTokens()) 
            
            {
                int data = Integer.parseInt(st.nextToken());
            
                //System.out.print(data + " ");
                node p = new node(data);
                q.adjacent = p;
                q = p;
            }

        //System.out.println();    
        //sc.nextLine();
        
            if (!sc.hasNextLine())
                break;
            else {
                vertex++;
                q = ver;
        
                node p = new node(vertex);
                q.vertex = p;
                q = p;
                ver = q;
            }
        }    
        
    
    }
            catch(Exception e)
                {System.out.println("Error"+e.toString());}
}
        
public static void Buildgraph(node q)
{ 
    
    int i = 1;
    Scanner keyboard = new Scanner(System.in); 
    String con ="y";
   
    while (con.equals("y")){
        
        node head = new node();
        head = q;
        
        System.out.println("Enter Vertx data followed by the adject vertex(es) for the "+ i +" vertex, use 0 to end squence");
    
        int data = keyboard.nextInt();
        q.data = data;
        while (data != 0)
        {
            data = keyboard.nextInt();
        
            if (data == 0)
                break;
            node p = new node(data);
            q.adjacent = p;
            q = p;
        }
        
        String extra = keyboard.nextLine();
        i++; 
        
        q = head;
        
       System.out.println("do you need to enter another vertex");
        con = keyboard.nextLine();
        if (!con.equals("y"))
            break;
     
        node p = new node(data);
        q.vertex = p;
        q = p;
     }
     
}     

public static void stateName(int state) {
    
        String stateString;
        switch (state) {
            case 1:  stateString = "Washington";
                     break;
            case 2:  stateString = "Oregon";
                     break;
            case 3:  stateString = "California";
                     break;
            case 4:  stateString = "Nevada";
                     break;
            case 5:  stateString = "Idaho";
                     break;
            case 6:  stateString = "Montana";
                     break;
            case 7:  stateString = "Utah";
                     break;
            case 8:  stateString = "Arizona";
                     break;
            case 9:  stateString = "Wyoming";
                     break;
            case 10: stateString = "Colorado";
                     break;
            case 11: stateString = "New Mexico";
                     break;
            case 12:  stateString = "North Dakota";
                     break;
            case 13:  stateString = "South Dakota";
                     break;
            case 14:  stateString = "Nebraska";
                     break;
            case 15:  stateString = "Kansas";
                     break;
            case 16:  stateString = "Oklahoma";
                     break;
            case 17:  stateString = "Texas";
                     break;
            case 18:  stateString = "Minnesota";
                     break;
            case 19:  stateString = "Iowa";
                     break;
            case 20:  stateString = "Missouri";
                     break;
            case 21: stateString = "Arkansas";
                     break;
            case 22: stateString = "Louisiana";
                     break;
            case 23:  stateString = "Wisconsin";
                     break;
            case 24:  stateString = "Illinois";
                     break;
            case 25:  stateString = "Kentucky";
                     break;
            case 26:  stateString = "Tennessee";
                     break;
            case 27:  stateString = "Mississippi";
                     break;
            case 28:  stateString = "Alabama";
                     break;
            case 29:  stateString = "Georgia";
                     break;
            case 30:  stateString = "Florida";
                     break;
            case 31:  stateString = "South Carolina";
                     break;
            case 32: stateString = "North Carolina";
                     break;
            case 33: stateString = "Virginia";
                     break;
            case 34:  stateString = "West Virginia";
                     break;
            case 35:  stateString = "Ohio";
                     break;
            case 36:  stateString = "Indiana";
                     break;
            case 37:  stateString = "Michigan";
                     break;
            case 38:  stateString = "Pennsylvania";
                     break;
            case 39:  stateString = "New York";
                     break;
            case 40:  stateString = "Vermont";
                     break;
            case 41:  stateString = "New Hampshire";
                     break;
            case 42:  stateString = "Maine";
                     break;
            case 43: stateString = "Massachusetts";
                     break;
            case 44: stateString = "Rhode Island";
                     break;
            case 45:  stateString = "Connecticut";
                     break;
            case 46:  stateString = "New Jersy";
                     break;
            case 47: stateString = "Delaware";
                     break;
            case 48: stateString = "Maryland";
                     break;    
            default: stateString = "not a state";
                     break;    
     
        }

        System.out.print(stateString + " ");    

}
    

public static void printGraph(node p) {
    
    node line = new node();
       
    while (p != null){
        
        line = p;
        
            while (line != null){
        
                //stateName(line.data);
                System.out.print(line.data + " "); 
                //System.out.print(line.visited + " ");
                line = line.adjacent;
            }
        
       System.out.println("\n"); 
           
           p = p.vertex;
   }


}

    
    


public static void DFS (node head, node current, int counter) {
	
    if (current != null || current.visited == 1)
    {
 
        node ver = new node();
        node adj = new node();
        ver = head;
        adj = head;
        
       
        
        //System.out.println("VERTEX "  + counter); //cout << p -> data;
        //System.out.println("DATA " + current.data + " "); //cout << p -> data;
        //stateName(current.data);
        System.out.print("State Visited: ");
        stateName(current.data); 
        System.out.println();
        current.visited = 1; //set p to “visited”
        int vist = current.data;
        //System.out.println(" counter =  "+ counter); //cout << p -> data;
        counter ++;
        
        while (ver != null){
            
            //System.out.println("marking vertexes visited - vertex");
            while (adj !=null){
            
                //System.out.println("marking vertexes visited - line");
                
                if (adj.data == vist)
                {
                    adj.visited = 1;
                    //System.out.println(" data =  "+ adj.data); //cout << p -> data;
                    //System.out.println(" visited =  "+ adj.visited);
                } 
                adj = adj.adjacent;}
            
            ver = ver.vertex;
            adj = ver;
                    
        }
        
        ver = head;
        adj = current;
        
       /* while (ver !=null) 
        {

           System.out.println("loop to find unvisited vertexes ");
           System.out.println("VER data =  "+ ver.data); //cout << p -> data;
           System.out.println("VER visited =  "+ ver.visited);     
         */  
           while (adj != null){ 
           
                    //System.out.println("loop to find unvisited adjacents ");
                    //System.out.println("ADJ data =  "+ adj.data); //cout << p -> data;
                    //System.out.println("ADJ visited =  "+ adj.visited);
                    
                    if (adj.visited == 0 )
                    {//if not visited visited
                        while (adj.data != ver.data)
                        {//find vertex
                                //System.out.println(" looking for vertex that goes to adjacent");
                                //System.out.println(" data =  "+ adj.data); //cout << p -> data;
                                //System.out.println(" visited =  "+ adj.visited);
                                ver = ver.vertex;
                            
                        } //cout << p -> data;}
                       
                         DFS(head, ver, counter);
                    }
           adj = adj.adjacent; //move to neigbbor
                   
           }

                
                  
//        }   

    }


}

public static void BFS (node p){

        
    Queue<node> Q = new LinkedList<node>();
    int counter = 1;
    Q.add(p); //Enq (p, Q)

    //System.out.println("Visited Vertex = " + p.data);
    //System.out.println("NOT IN LOOP Visited DATA = " + p.data); //TEST
    visitVertx(p, p.data);
    
        node ver = new node();
        node adj = new node();
        ver = p;
        //adj = p;
    
        while (!Q.isEmpty()){ //	while notEmpty (Q) do
            adj = Q.remove(); //		n = Deq (Q)
            
            adj.level++;
            int anyVisited = 0;
            //System.out.println("REMOVED FROM Q checking vertex with  DATA = " + adj.data + " LEVEL " + adj.level + "\n"); //TEST
            System.out.print("State Visited: ");
            stateName(adj.data); 
            System.out.print(" LEVEL " + adj.level + "\n");
            //System.out.print();
                        
            while (ver.data != adj.data)
                ver = ver.vertex; //moves to next vertex, not adjecent vertex
             //not sure if it is necessary, thoritically checking to make sure at correct vertex
             
            adj = ver; //moves us back to the vertex or else we get lost in an adject vertex with same data
                
             //System.out.println("In if statement checking vertex with  DATA = " + adj.data); 
                while (adj != null){ //		for every vertex, m, adjacent to n, do
                
                //System.out.println("in loop visited adjacent DATA = " + adj.data);
                   
                 
                    if (adj.visited == 0){ //			if m is not visited
                        //System.out.println("LEVEL " + counter);
                        //System.out.println("in loop not yet visited DATA = " + adj.data);
                        //System.out.print("Visited Vertex = " + adj.data + "\n");
                        Q.add(adj); //Enq (p, Q)
                        adj.visited = 1; //set m to “visited”
                        adj.level = counter;
                        visitVertx(p, adj.data); //set m to “visited”
                        anyVisited++;
                        //printGraph(p);        //TEST
                    } //	
                
                    adj = adj.adjacent; //	move to next adjecent vertex			
                    ver = p;
                }
            if (anyVisited > 0)          
                counter++;
        }
    
}


public static void visitVertx (node p, int data){
        
        node ver = new node();
        node adj = new node();
        ver = p;
        adj = p;
        int counter = 0;
       
        
        //System.out.println("VERTEX "  + counter); //cout << p -> data;
        //System.out.println("DATA " + p.data + " "); //cout << p -> data;
        //p.visited = 1; //set p to “visited”
        //int vist = p.data;
        //System.out.println(" counter =  "+ counter); //cout << p -> data;
        counter ++;
        
        while (ver != null){
            
            //System.out.println("marking vertexes visited - vertex");
            while (adj !=null){
            
                //System.out.println("marking vertexes visited - line");
                
                if (adj.data == data)
                {
                    adj.visited = 1;
                    //System.out.println(" data =  "+ adj.data); //cout << p -> data;
                    //System.out.println(" visited =  "+ adj.visited);
                } 
                adj = adj.adjacent;}
            
            ver = ver.vertex;
            adj = ver;
                    
        }

}
}


