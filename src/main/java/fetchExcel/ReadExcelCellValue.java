package fetchExcel;

public class ReadExcelCellValue {

	private ReadExcelSheet rs = new ReadExcelSheet();
	
	public String LoginPageCellValue(int row, int cell) throws Throwable {
		String CellValue = rs.getLoginPageSheet().getRow(row).getCell(cell).getStringCellValue();
		return CellValue;
	}
}
