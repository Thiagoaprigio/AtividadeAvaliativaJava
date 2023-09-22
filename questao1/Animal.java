package questao1;

public class Animal {
        public void fazerBarulho(){  
            System.out.println("Animal fazendo barulho");
        }
    }

    class cachorro extends Animal {
        public void fazerBarulho(){
            System.out.println("Cachorro fazendo barulho");
        }
    }
    
    class gato extends Animal {
        @Override
        public void fazerBarulho() {
            System.out.println("Gato fazendo barulho");
        }
    }

