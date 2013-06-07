all:
	javac -J-Xmx2G Programa.java
tudo:
	javac -J-Xmx2G conclusionObserver.java Converter.java IAdapter.java inOutObserver.java IObserver.java ISubject.java numericDatetoStrDate.java Programa.java usaDateToPtBR.java IAbstractFactory.java FabricaAbstractFactory.java
exec: 
	java -Xmx2G Programa
del:
	rm -rf *.class
