package practice13.common;

	public class SuperHero extends Hero {
		/** 装備しているアイテム */
		private Item equipment;

		/**
		 * 装備しているアイテムを取得します
		 * @return	装備しているアイテム
		 */
		public Item getEquipment() {		//get
			return equipment;
		}

		/**
		 * アイテムを装備します
		 * @param equipment	装備したいアイテム
		 */
		public void setEquipment(Item equipment) {		//set
			this.equipment = equipment;
		}

		@Override
		public int attack() {		//attackメソッドをオーバーライド
			return super.attack() + this.equipment.getAdditionalDamage();
		}
	}