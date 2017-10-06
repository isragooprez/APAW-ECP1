package strategy;

public class Soldado {

	private Contexto contexto;

	public Soldado() {
		contexto = new Contexto();
	}
	
	public void playerNovato(){
		
		IStrategy iStrategyFusil=new StrategyFusil();
		contexto.setIstrategy(iStrategyFusil);
		contexto.ObtenerDescripcionStrategia();
		contexto.Atacar(1);
		contexto.Recargar(100);
		
		
		
	}
	
	public void playerJunior() {
		IStrategy iStrategyJunior= new StrategyRifle();
		contexto.setIstrategy(iStrategyJunior);
		
	
	}
	
	public void playerAmateur() {
		IStrategy iStrategyPistola= new StrategyPistola();
		contexto.setIstrategy(iStrategyPistola);
		
	}
	
	public void Informacion(int estadoAtacar, int NumeroMunicion ) {
		System.out.println(contexto.ObtenerDescripcionStrategia());
		System.out.println(contexto.Atacar(estadoAtacar));
		System.out.println(contexto.Recargar(NumeroMunicion));
	}

}
