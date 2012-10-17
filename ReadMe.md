Labo sur les commandes GIT

Welcome to Git (version 1.7.8-preview20111206)


Run 'git help git' to display the help index.
Run 'git help <command>' to display help for specific commands.

fb491836@C32647 ~
$

fb491836@C32647 ~
$

fb491836@C32647 ~
$

fb491836@C32647 ~
$

fb491836@C32647 ~
$ git help
usage: git [--version] [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p|--paginate|--no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           [-c name=value] [--help]
           <command> [<args>]

The most commonly used git commands are:
   add        Add file contents to the index
   bisect     Find by binary search the change that introduced a bug
   branch     List, create, or delete branches
   checkout   Checkout a branch or paths to the working tree
   clone      Clone a repository into a new directory
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   fetch      Download objects and refs from another repository
   grep       Print lines matching a pattern
   init       Create an empty git repository or reinitialize an existing one
   log        Show commit logs
   merge      Join two or more development histories together
   mv         Move or rename a file, a directory, or a symlink
   pull       Fetch from and merge with another repository or a local branch
   push       Update remote refs along with associated objects
   rebase     Forward-port local commits to the updated upstream head
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index
   show       Show various types of objects
   status     Show the working tree status
   tag        Create, list, delete or verify a tag object signed with GPG

See 'git help <command>' for more information on a specific command.

fb491836@C32647 ~
$ pwd
/c/Users/fb491836

fb491836@C32647 ~
$ ls -l
total 6218
drwxr-xr-x    5 fb491836 Administ        0 Nov 21  2010 AppData
drwxr-xr-x    0 fb491836 Administ    16384 Sep 25 20:03 Application Data
drwxr-xr-x    2 fb491836 Administ        0 Nov  8  2011 Aptana Rubles
drwxr-xr-x    2 fb491836 Administ        0 Oct 19  2011 CmapToolsLogs
drwxr-xr-x    2 fb491836 Administ        0 Nov  3  2011 Cn3D_User
dr-xr-xr-x    2 fb491836 Administ        0 Oct  3 13:18 Contacts
drwxr-xr-x    0 fb491836 Administ    16384 Oct 17 13:34 Cookies
dr-xr-xr-x    2 fb491836 Administ     4096 Oct  3 13:18 Desktop
dr-xr-xr-x   23 fb491836 Administ     8192 Oct 10 13:27 Documents
dr-xr-xr-x    2 fb491836 Administ        0 Oct  3 13:18 Downloads
dr-xr-xr-x    8 fb491836 Administ     4096 Oct  3 13:18 Favorites
drwxr-xr-x    4 fb491836 Administ        0 Oct 17 13:34 INF2015
drwxr-xr-x    2 fb491836 Administ        0 Oct 18  2011 InstallAnywhere
dr-xr-xr-x    2 fb491836 Administ     4096 Oct  3 13:18 Links
drwxr-xr-x    0 fb491836 Administ     8192 Oct  3 13:18 Local Settings
dr-xr-xr-x    0 fb491836 Administ        0 Oct  3 13:18 Menu D?marrer
dr-xr-xr-x    0 fb491836 Administ     8192 Oct 10 13:27 Mes documents
drwxr-xr-x    0 fb491836 Administ        0 Jul 14  2009 Mod?les
dr-xr-xr-x    2 fb491836 Administ        0 Oct  3 13:18 Music
-rw-r--r--    1 fb491836 Administ 11272192 Oct 17 13:36 NTUSER.DAT
-rw-r--r--    1 fb491836 Administ    65536 Oct  3 14:44 NTUSER.DAT{016888bd-6c6f-11de-8d1d-001e0bcde3ec}.TM.blf
-rw-r--r--    1 fb491836 Administ   524288 Oct  3 14:44 NTUSER.DAT{016888bd-6c6f-11de-8d1d-001e0bcde3ec}.TMContainer0000
0000000000000001.regtrans-ms
-rw-r--r--    1 fb491836 Administ   524288 Oct  3 14:44 NTUSER.DAT{016888bd-6c6f-11de-8d1d-001e0bcde3ec}.TMContainer0000
0000000000000002.regtrans-ms
dr-xr-xr-x    2 fb491836 Administ        0 Oct  3 13:18 Pictures
dr-xr-xr-x    0 fb491836 Administ        0 Oct  3 13:18 Recent
dr-xr-xr-x    2 fb491836 Administ        0 Oct  3 13:18 Saved Games
dr-xr-xr-x    2 fb491836 Administ     4096 Oct  3 13:18 Searches
dr-xr-xr-x    0 fb491836 Administ     4096 Nov 18  2011 SendTo
dr-xr-xr-x    3 fb491836 Administ        0 Oct  3 13:18 Videos
drwxr-xr-x    3 fb491836 Administ        0 Feb  7  2012 VirtualBox VMs
drwxr-xr-x    0 fb491836 Administ        0 Jul 14  2009 Voisinage d'impression
drwxr-xr-x    0 fb491836 Administ        0 Jan  6  2012 Voisinage r?seau
drwxr-xr-x    2 fb491836 Administ        0 Nov  1  2011 Zero G Registry
drwxr-xr-x    2 fb491836 Administ        0 Feb  2  2012 bluej
drwxr-xr-x    2 fb491836 Administ        0 Nov 12  2011 flexdock
-rw-r--r--    1 fb491836 Administ       42 Feb  3  2012 grok.dbg
-rw-r--r--    1 fb491836 Administ       43 Nov 18  2011 gsview32.ini
drwxr-xr-x    2 fb491836 Administ        0 Nov  3  2011 molmol
-rw-r--r--    1 fb491836 Administ   262144 Oct 17 13:36 ntuser.dat.LOG1
-rw-r--r--    1 fb491836 Administ        0 Oct  3 13:18 ntuser.dat.LOG2
-rw-r--r--    1 fb491836 Administ       20 Nov 21  2010 ntuser.ini
-r--r--r--    1 fb491836 Administ     3904 Oct 17 13:00 ntuser.pol
-rw-r--r--    1 fb491836 Administ       16 Nov  1  2011 persistent_state
-rw-r--r--    1 fb491836 Administ        0 Nov  8  2011 spcmd4.hst
drwxr-xr-x    3 fb491836 Administ        0 Nov 25  2011 visualparadigm
drwxr-xr-x    2 fb491836 Administ        0 Nov 25  2011 vpworkspace

fb491836@C32647 ~
$ cd INf2015

fb491836@C32647 ~/INf2015
$ ls -l
total 7530
-rw-r--r--    1 fb491836 Administ    33792 Oct 10 15:27 Dessin1.vsd
-rwxr-xr-x    1 fb491836 Administ 15383103 Oct 17 13:34 Git-1.7.11-preview20120710.exe
drwxr-xr-x    9 fb491836 Administ     4096 Oct 10 15:27 Labo2
drwxr-xr-x    4 fb491836 Administ        0 Oct 17 13:31 Labo4

fb491836@C32647 ~/INf2015
$ ls -l
total 7530
-rw-r--r--    1 fb491836 Administ    33792 Oct 10 15:27 Dessin1.vsd
-rwxr-xr-x    1 fb491836 Administ 15383103 Oct 17 13:34 Git-1.7.11-preview20120710.exe
drwxr-xr-x    9 fb491836 Administ     4096 Oct 10 15:27 Labo2
drwxr-xr-x    4 fb491836 Administ        0 Oct 17 13:31 Labo4

fb491836@C32647 ~/INf2015
$ ls -l
total 7530
-rw-r--r--    1 fb491836 Administ    33792 Oct 10 15:27 Dessin1.vsd
-rwxr-xr-x    1 fb491836 Administ 15383103 Oct 17 13:34 Git-1.7.11-preview20120710.exe
drwxr-xr-x    9 fb491836 Administ     4096 Oct 10 15:27 Labo2
drwxr-xr-x    4 fb491836 Administ        0 Oct 17 13:31 Labo4

fb491836@C32647 ~/INf2015
$ ls
Dessin1.vsd  Git-1.7.11-preview20120710.exe  Labo2  Labo4

fb491836@C32647 ~/INf2015
$ git init
Initialized empty Git repository in c:/Users/fb491836/INf2015/.git/

fb491836@C32647 ~/INf2015 (master)
$ dir
sh.exe": dir: command not found

fb491836@C32647 ~/INf2015 (master)
$ ls -l
total 7530
-rw-r--r--    1 fb491836 Administ    33792 Oct 10 15:27 Dessin1.vsd
-rwxr-xr-x    1 fb491836 Administ 15383103 Oct 17 13:34 Git-1.7.11-preview20120710.exe
drwxr-xr-x    9 fb491836 Administ     4096 Oct 10 15:27 Labo2
drwxr-xr-x    4 fb491836 Administ        0 Oct 17 13:31 Labo4

fb491836@C32647 ~/INf2015 (master)
$

fb491836@C32647 ~/INf2015 (master)
$

fb491836@C32647 ~/INf2015 (master)
$ ls -l
total 7531
-rw-r--r--    1 fb491836 Administ    33792 Oct 10 15:27 Dessin1.vsd
-rwxr-xr-x    1 fb491836 Administ 15383103 Oct 17 13:34 Git-1.7.11-preview20120710.exe
drwxr-xr-x    9 fb491836 Administ     4096 Oct 10 15:27 Labo2
drwxr-xr-x    4 fb491836 Administ        0 Oct 17 13:31 Labo4
-rw-r--r--    1 fb491836 Administ       26 Oct 17 13:42 ReadMe.md

fb491836@C32647 ~/INf2015 (master)
$ git statut
git: 'statut' is not a git command. See 'git --help'.

Did you mean this?
        status

fb491836@C32647 ~/INf2015 (master)
$ git status
# On branch master
#
# Initial commit
#
# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#
#       Dessin1.vsd
#       Git-1.7.11-preview20120710.exe
#       Labo2/
#       Labo4/
#       ReadMe.md
nothing added to commit but untracked files present (use "git add" to track)

fb491836@C32647 ~/INf2015 (master)
$ git add ReadMe.md

fb491836@C32647 ~/INf2015 (master)
$ git status
# On branch master
#
# Initial commit
#
# Changes to be committed:
#   (use "git rm --cached <file>..." to unstage)
#
#       new file:   ReadMe.md
#
# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#
#       Dessin1.vsd
#       Git-1.7.11-preview20120710.exe
#       Labo2/
#       Labo4/

fb491836@C32647 ~/INf2015 (master)
$ git commit -m "Test de la commande ADD et COMMIT"
[master (root-commit) 209911a] Test de la commande ADD et COMMIT
 Committer: unknown <fb491836@C32647.ens.uqam.ca>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 files changed, 1 insertions(+), 0 deletions(-)
 create mode 100644 ReadMe.md

fb491836@C32647 ~/INf2015 (master)
$ git status
# On branch master
# Untracked files:
#   (use "git add <file>..." to include in what will be committed)
#
#       Dessin1.vsd
#       Git-1.7.11-preview20120710.exe
#       Labo2/
#       Labo4/
nothing added to commit but untracked files present (use "git add" to track)

fb491836@C32647 ~/INf2015 (master)
$ git remote add origin https://github.com/SERFRAN/FRANCIS.git

fb491836@C32647 ~/INf2015 (master)
$ git push -u master
fatal: 'master' does not appear to be a git repository
fatal: The remote end hung up unexpectedly

fb491836@C32647 ~/INf2015 (master)
$ git push -u origin master
Username for 'github.com':
Password for 'github.com':
fatal: Authentication failed

fb491836@C32647 ~/INf2015 (master)
$ git push -u origin master
Username for 'github.com':
Password for 'github.com':
To https://github.com/SERFRAN/FRANCIS.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/SERFRAN/FRANCIS.git'
To prevent you from losing history, non-fast-forward updates were rejected
Merge the remote changes (e.g. 'git pull') before pushing again.  See the
'Note about fast-forwards' section of 'git push --help' for details.

fb491836@C32647 ~/INf2015 (master)
$ git push -f
Username for 'github.com':
Password for 'github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 261 bytes, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/SERFRAN/FRANCIS.git
 + 971a820...209911a master -> master (forced update)

fb491836@C32647 ~/INf2015 (master)
$
