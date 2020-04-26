package dp23.behavioral_11.memento;

public class FileWriterCaretaker {

	private Object obj;
	
	public void save(FileWriterOriginatorUtil fileWriter){
		this.obj=fileWriter.save();
	}
	
	public void undo(FileWriterOriginatorUtil fileWriter){
		fileWriter.undoToLastSave(obj);
	}
}
