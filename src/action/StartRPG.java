package action;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import tabs.Armour;
import tabs.BattleGroup;
import tabs.Enemy;
import tabs.GameCharacter;
import tabs.Grenade;
import tabs.Item;
import tabs.Medical;
import tabs.Quest;
import tabs.Skill;
import tabs.WeakEntity;
import tabs.Weapon;

public class StartRPG extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Skill skillsTab = new Skill();
	Item itemsTab = new Item();
	Armour armourTab = new Armour();
	BattleGroup battleGroupTab = new BattleGroup();
	GameCharacter gameCharacterTab = new GameCharacter();
	Enemy enemyTab = new Enemy();
	Grenade grenadeTab = new Grenade();
	Medical medicalTab = new Medical();
	Quest questTab = new Quest();
	WeakEntity weakEntityTab = new WeakEntity();
	Weapon weaponTab = new Weapon();

	public static void main(String[] args) {
		StartRPG rpgDatabase = new StartRPG();
		rpgDatabase.init();
		rpgDatabase.setVisible(true);

	}

	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);

		JTabbedPane tab = new JTabbedPane();

		tab.add(itemsTab, "Item");
		tab.add(weaponTab, "Weapon");
		tab.add(armourTab, "Armour");
		tab.add(medicalTab, "Medical");
		tab.add(grenadeTab, "Grenade");
		tab.add(questTab, "Quest");
		tab.add(gameCharacterTab, "Character");
		tab.add(skillsTab, "Skills");
		tab.add(enemyTab, "Enemy");
		tab.add(battleGroupTab, "Battle Group");
		tab.add(weakEntityTab, "Weak Entity");

		this.add(tab);

	}

}