package com.localadmin.model;

import java.io.Serializable;

public enum Dailyoperators implements Serializable {
	
	ADD(NameEnum.ADD, SymbolEnum.ADD, ReadableNameEnum.ADD),
	MULTIPLY(NameEnum.MULTIPLY, SymbolEnum.MULTIPLY, ReadableNameEnum.MULTIPLY),
	DIVIDE(NameEnum.DIVIDE, SymbolEnum.DIVIDE, ReadableNameEnum.DIVIDE),
	MINUS(NameEnum.MINUS, SymbolEnum.MINUS, ReadableNameEnum.MINUS);

	/**
	 * The name of the operator
	 */
	public enum NameEnum {
		ADD("ADD"),

		MINUS("MINUS"),

		MULTIPLY("MULTIPLY"),

		DIVIDE("DIVIDE");

		private String value;

		NameEnum(String value) {
			this.value = value;
		}

		public String toString() {
			return String.valueOf(value);
		}

		public static NameEnum fromValue(String value) {
			for (NameEnum b : NameEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	private final NameEnum name;

	/**
	 * The symbol of the operator
	 */
	public enum SymbolEnum {
		ADD("+"),

		MINUS("-"),

		DIVIDE("÷"),

		MULTIPLY("x");

		private String value;

		SymbolEnum(String value) {
			this.value = value;
		}

		public String toString() {
			return String.valueOf(value);
		}

		public static SymbolEnum fromValue(String value) {
			for (SymbolEnum b : SymbolEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	private final SymbolEnum symbol;

	/**
	 * A readble name
	 */
	public enum ReadableNameEnum {
		MULTIPLY("mal"),

		DIVIDE("durch"),

		MINUS("minus"),

		ADD("plus");

		private String value;

		ReadableNameEnum(String value) {
			this.value = value;
		}

		public String toString() {
			return String.valueOf(value);
		}

		public static ReadableNameEnum fromValue(String value) {
			for (ReadableNameEnum b : ReadableNameEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}
	}

	private final ReadableNameEnum readableName;

	private Dailyoperators(NameEnum name, SymbolEnum symbol, ReadableNameEnum readableName) {
		this.name = name;
		this.symbol = symbol;
		this.readableName = readableName;
	}

	/**
	 * The name of the operator
	 * 
	 * @return name
	 */
	public NameEnum getName() {
		return name;
	}

	/**
	 * The symbol of the operator
	 * 
	 * @return symbol
	 */
	public SymbolEnum getSymbol() {
		return symbol;
	}

	/**
	 * A readble name
	 * 
	 * @return readableName
	 */
	public ReadableNameEnum getReadableName() {
		return readableName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AutoGenDailyoperators {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    readableName: ").append(toIndentedString(readableName)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
