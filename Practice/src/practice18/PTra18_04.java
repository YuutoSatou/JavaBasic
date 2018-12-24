package practice18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02�ō쐬����Player�N���X���g�p���܂�
	 */

	public static void main(String[] args) {

		/*
		 * �@
		 * �� file/BestElevenCandidate.csv�̓��e���擾���A�P�s����Player�C���X�^���X�ɏ����i�[���Ă�������
		 * �� ArrayList���쐬���āAPlayer�C���X�^���X���i�[���Ă�������
		 */
		FileReader fr = null;
		try {
			fr = new FileReader("file/BestElevenCandidate.csv");
		} catch (FileNotFoundException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		entity et = new entity();								//et �C���X�^���X
		// TODO:��̍s�̏����͕s�v�ł͂Ȃ��ł��傤���H�ȉ��̍s�ŎQ�Ƃ���Ă��Ȃ��悤�ł��B
		String line;
		ArrayList<Player> array = new ArrayList<Player>();		//ArrayList
		try {
			while((line = br.readLine()) !=null) {					//null�ł͂Ȃ��ꍇ�́B
				String[] s = new String[4];							//s�z��
				Player p = new Player();							//p  �C���X�^���X
				s = line.split(",");								//split���g�p
				p.setPosition(s[0] + ",");							//Potiton
				p.setName(s[1] + ",");								//Name
				p.setCountry(s[2] + ",");							//Country
				p.setTeam(s[3] + ",");								//Team

				array.add(p);										//add���\�b�h

			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		Collections.shuffle(array);
		Collections.shuffle(array);
		Collections.shuffle(array);
		Collections.shuffle(array);
		// ��L4�s�̓R���p�C���G���[�ɂȂ�܂��B
		// Collections.shuffle(array);
		// �Ƃ��Ă��������B


		// �� �@��ArrayList�̒�����GK1���ADF4���AMF4��, FW2���������_���ŏo�͂��Ă�������
		System.out.println(array.get(0));
		System.out.println(array.get(0));	    //4��
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println(array.get(3));
		System.out.println(array.get(0));		//4��
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println(array.get(3));
		System.out.println(array.get(1));		//1��
		// ��L10�s�̓R���p�C���G���[�ɂȂ�܂��B
		// �|�W�V�����ŏ������򂳂��A�|�W�V�������܂�����sysout���Ȃ��悤�ɂ���B
		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for(Player player : array){
			String position = player.getPosition();

			switch (position) {
			case "GK":
				if(gkCount < 1) {
					System.out.println(player);
					gkCount++;
				}
				break;
			case "DF":
				if(dfCount < 4) {
					System.out.println(player);
					dfCount++;
				}
				break;
			case "MF":
				if(mfCount < 4) {
					System.out.println(player);
					mfCount++;
				}
				break;
			case "FW":
				if(fwCount < 2) {
					System.out.println(player);
					fwCount++;
				}
				break;
			}
		}
	}
}