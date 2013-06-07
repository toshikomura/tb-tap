public class FabricaAbstractFactory implements IAbstractFactory {
	public Converter instanciaConverter () {
		return new Converter ();
	}
	public usaDateToPtBR instanciausaDateToPtBR () {
		return new usaDateToPtBR ();
	}
	public numericDatetoStrDate instancianumericDatetoStrDate () {
		return new numericDatetoStrDate ();
	}
}
