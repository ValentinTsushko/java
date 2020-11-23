public class AsciiCharSequence implements CharSequence{
	private byte[] simvols;
	
	public AsciiCharSequence(byte[] tmp) {  //  konstruktor
        simvols = tmp;
    }
	
	@Override
	public int length() {
        return simvols.length;
    }
	@Override
	public char charAt(int index){
		return (char)simvols[index];
	}
	@Override
	public AsciiCharSequence subSequence(int beginIndex, int endIndex){
		byte[] Sequence = new byte [endIndex - beginIndex];
		for(int i = beginIndex; i < endIndex; i++){
			Sequence[i - beginIndex] = simvols[i];
		}
		return new AsciiCharSequence(Sequence);
	}
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < simvols.length; i++){
			str.append((char)simvols[i]);
		}
		return str.toString();
	}
}
//implements CharSequence
