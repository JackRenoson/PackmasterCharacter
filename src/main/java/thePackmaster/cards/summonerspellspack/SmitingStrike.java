package thePackmaster.cards.summonerspellspack;

import com.evacipated.cardcrawl.mod.stslib.fields.cards.AbstractCard.PersistFields;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import thePackmaster.SpireAnniversary5Mod;
import thePackmaster.actions.summonerspellspack.SmitingStrikeAction;

public class SmitingStrike extends AbstractSummonerSpellsCard {
    public static final String ID = SpireAnniversary5Mod.makeID("SmitingStrike");
    private static final int COST = 1;
    private static final int DAMAGE = 9;
    private static final int UPG_DAMAGE = 3;

    public SmitingStrike() {
        super(ID, COST, CardType.ATTACK, CardRarity.COMMON, CardTarget.ENEMY);
        this.tags.add(CardTags.STRIKE);
        this.damage = this.baseDamage = DAMAGE;
        this.selfRetain = true;
    }

    @Override
    public void upp() {
        upgradeDamage(UPG_DAMAGE);
    }

    @Override
    public void use(AbstractPlayer p, AbstractMonster m) {
        addToBot(new SmitingStrikeAction(damage, m, p));
    }
}
