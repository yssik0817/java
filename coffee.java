package javaex;


public class coffee {
	//������ �����ε�
		public coffee(){}
        public coffee(int coffee, int sugar, int cream) {
        		this.coffee=coffee;
        		this.sugar=sugar;
        		this.cream=cream;
        	}
        	
        	private int coffee=1;
        	private int sugar=1;
        	private int cream=1;
        	
        	public void make(int coffee) {
        		this.coffee=coffee;
        		System.out.printf("Ŀ�� : "+this.coffee);
        		System.out.println("���� ����� �����ϴ�.");        		
        	}
        	
        	public void make(int coffee, int sugar) {
        		this.coffee=coffee;
        		this.sugar=sugar;
        		System.out.printf("Ŀ�� : "+this.coffee);
        		System.out.printf("���� : "+this.sugar);
        		System.out.println("���� ����� �����ϴ�.");        		
        	}
        	public void make(int coffee, int sugar, int cream) {
        		this.coffee=coffee;
        		this.sugar=sugar;
        		this.cream=cream;
        		System.out.printf("Ŀ�� : "+this.coffee);
        		System.out.printf("���� : "+this.sugar);
        		System.out.printf("ũ�� : "+this.cream);
        		System.out.println("���� ����� �����ϴ�.");        		
        	}
        }

